package co.edu.umb.buymyfunkobe.business.controller;

import co.edu.umb.buymyfunkobe.business.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

  private UserService userService;
}
