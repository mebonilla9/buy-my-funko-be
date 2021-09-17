-- create database buy_my_funko;
-- create user funko with encrypted password 'Funko1234!';
-- grant all privileges on database buy_my_funko to funko;

CREATE TABLE "product"
(
    "id"          SERIAL PRIMARY KEY,
    "title"       varchar(150)  NOT NULL,
    "description" text,
    "price"       numeric(6, 2) NOT NULL,
    "id_category" int           NOT NULL
);

CREATE TABLE "image"
(
    "id"  SERIAL PRIMARY KEY,
    "url" varchar(255) NOT NULL
);

CREATE TABLE "category"
(
    "id"             SERIAL PRIMARY KEY,
    "name"           varchar(50) NOT NULL,
    "id_subcategory" int
);

CREATE TABLE "inventory"
(
    "id"         SERIAL PRIMARY KEY,
    "quantity"   int       NOT NULL,
    "updated_at" timestamp NOT NULL,
    "id_product" int       NOT NULL
);

CREATE TABLE "review"
(
    "id"         SERIAL PRIMARY KEY,
    "score"      int       NOT NULL,
    "created_at" timestamp NOT NULL,
    "content"    text      NOT NULL,
    "likes"      int,
    "id_user"    int       NOT NULL,
    "id_product" int       NOT NULL
);

CREATE TABLE "shopping_cart"
(
    "id"          SERIAL PRIMARY KEY,
    "quantity"    int           NOT NULL,
    "total_price" numeric(7, 2) NOT NULL,
    "id_product"  int           NOT NULL,
    "id_user"     int           NOT NULL
);

CREATE TABLE "shipping"
(
    "id"               SERIAL PRIMARY KEY,
    "sent_at"          timestamp NOT NULL,
    "received_at"      timestamp NOT NULL,
    "id_address"       int       NOT NULL,
    "id_order_history" int       NOT NULL
);

CREATE TABLE "order_history"
(
    "id"          SERIAL PRIMARY KEY,
    "quantity"    int           NOT NULL,
    "total_price" numeric(7, 2) NOT NULL,
    "products"    json          NOT NULL
);

CREATE TABLE "user"
(
    "id"       SERIAL PRIMARY KEY,
    "name"     varchar(70)  NOT NULL,
    "email"    varchar(80)  NOT NULL,
    "password" varchar(255) NOT NULL,
    "enable"   boolean      NOT NULL DEFAULT true
);

CREATE TABLE "address"
(
    "id"       SERIAL PRIMARY KEY,
    "address"  varchar(150) NOT NULL,
    "city"     varchar(30)  NOT NULL,
    "region"   varchar(60)  NOT NULL,
    "zip_code" varchar(10)  NOT NULL,
    "phone"    varchar(20)  NOT NULL
);

CREATE TABLE "user_address"
(
    "id"         SERIAL PRIMARY KEY,
    "id_user"    int NOT NULL,
    "id_address" int NOT NULL
);

CREATE TABLE "image_product"
(
    "id"         SERIAL PRIMARY KEY,
    "id_image"   int NOT NULL,
    "id_product" int NOT NULL
);

ALTER TABLE "product"
    ADD FOREIGN KEY ("id_category") REFERENCES "category" ("id");

ALTER TABLE "category"
    ADD FOREIGN KEY ("id_subcategory") REFERENCES "category" ("id");

ALTER TABLE "inventory"
    ADD FOREIGN KEY ("id_product") REFERENCES "product" ("id");

ALTER TABLE "review"
    ADD FOREIGN KEY ("id_user") REFERENCES "user" ("id");

ALTER TABLE "review"
    ADD FOREIGN KEY ("id_product") REFERENCES "product" ("id");

ALTER TABLE "shopping_cart"
    ADD FOREIGN KEY ("id_product") REFERENCES "product" ("id");

ALTER TABLE "shopping_cart"
    ADD FOREIGN KEY ("id_user") REFERENCES "user" ("id");

ALTER TABLE "shipping"
    ADD FOREIGN KEY ("id_address") REFERENCES "address" ("id");

ALTER TABLE "shipping"
    ADD FOREIGN KEY ("id_order_history") REFERENCES "order_history" ("id");

ALTER TABLE "user_address"
    ADD FOREIGN KEY ("id_user") REFERENCES "user" ("id");

ALTER TABLE "user_address"
    ADD FOREIGN KEY ("id_address") REFERENCES "address" ("id");

ALTER TABLE "image_product"
    ADD FOREIGN KEY ("id_image") REFERENCES "image" ("id");

ALTER TABLE "image_product"
    ADD FOREIGN KEY ("id_product") REFERENCES "product" ("id");

