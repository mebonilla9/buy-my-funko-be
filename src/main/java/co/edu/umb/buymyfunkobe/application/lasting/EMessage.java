package co.edu.umb.buymyfunkobe.application.lasting;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Manuel Ernesto Bonilla Muñoz - mebonilla9@gmail.com
 */
@Getter
@RequiredArgsConstructor
public enum EMessage {

  ERROR_TOKEN_REQUIRED(-1000, "Error, el token de usuario es requerido para hacer esta petición"),
  ERROR_FORMAT_EMAIL(-1, "Debe escribir un correo"),
  ERROR_INVALID_PASSWORD(-1, "Debe escribir una contraseña"),
  ERROR_LOGIN(-2, "Las credenciales de usuario son invalidas"),
  ERROR_INVALID_NAME(-1, "Debe escribir un nombre"),
  ERROR_INVALID_EMAIL(-1, "Debe escribir un correo"),
  ERROR_EMAIL_NO_REGISTERED(-1, "El correo ingresado no se encuentra registrado en la plataforma"),
  ERROR_USER_REGISTERED(-1, "El usuario ya se encuentra registrado en la plataforma"),
  ERROR_PREFERENCES_FORMAT(-1, "El formato de las preferencias es incorrecto"),
  NO_RESULTS(0, "No se encontraron registros en el sistema"),
  SUCCESS_LOGIN(1, "Usuario autenticado, bienvenido"),
  USER_CREATED(1, "La cuenta de usuario ha sido creada"),
  SUCCESS_PWD_REQUEST(1, "Se ha confirmado su solicitud de reestablecimiento de contraseña. Verifique " +
    "su correo electronico"),
  SUCCESS_PWD_RESET(1, "Se ha reestablecido la contraseña correctamente"),
  SUCCESS_USER_QUERY(1, "Se ha consultado exitosamente"),
  RECORD_UPDATED(1, "Se ha actualizado el registro"),
  RECORD_CREATED(1, "Se ha creado el registro"),
  ERROR_RECIPE_NAME_NOT_REGISTERED(-1,"Debe ingresar el nombre de la receta"),
  ERROR_RECIPIE_STEPS_NOT_REGISTERED(-1, "Debe agregar la lista de pasos para preparar la receta"),
  ERROR_INGREDIENTS_LIST_SIZE(-1, "La cantidad de ingredientes para registrar la receta debe ser mayor " +
    "a 1"),
  ERROR_INGREDIENTS_NOT_FOUND(-1, "Debe ingresar una lista de ingredientes para crear la receta"),
  ERROR_INGREDIENT_QUANTITY_NOT_REGISTERED(-1, "No se registró la cantidad de un ingrediente"),
  ERROR_UPLOAD_IMAGE(-3, "La imagen no fue cargada al servidor"),
  ERROR_PARSE_RECIPE_PART(-4, "Los datos de la receta no se encuentran correctamente diligenciados"),
  ERROR_IMAGE_NOT_FOUND(-4, "La imagen que busca no se encuentra almacenada en el servidor"),
  ERROR_RECIPE_NOT_FOUND(-1, "Receta no encontrada"),
  ERROR_RATING_VALUE(-1, "El valor de la calificacion debe ser de 0 a 5"),
  ERROR_RATING(-1, "Se debe enviar una calificacion o un comentario"),
  ERROR_RATING_ID_RECIPE(-1, "Se debe enviar el id de la receta a calificar"),
  ERROR_ACCESS_DENIED(-1, "Acceso denegado"),
  ERROR_ADVERTISING_TITLE(-1, "Debe escribir un titulo"),
  ERROR_ADVERTISING_IMG(-1, "Debe cargar una imagen"),
  ERROR_ADVERTISING_URL(-1, "Debe escribir una url de redireccionamiento"),
  ERROR_ID_REQUIRED(-1, "Debe escribir el id"),
  ERROR_RECORD_DOES_NOT_EXIST(-1, "El registro al que intenta acceder no existe"),
  ERROR_UPDATE_IMAGE(-1, "No se pudo editar la imagen");

  private final int code;
  private final String message;

  public Integer getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

}
