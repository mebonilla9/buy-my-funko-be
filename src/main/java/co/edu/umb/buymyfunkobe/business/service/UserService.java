package co.edu.umb.buymyfunkobe.business.service;

import co.edu.umb.buymyfunkobe.business.mapper.UserMapper;
import co.edu.umb.buymyfunkobe.model.dto.UserDto;
import co.edu.umb.buymyfunkobe.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

  private UserRepository userRepository;

  @Transactional(rollbackOn = Exception.class)
  public void registerUser(UserDto user){
    userRepository.save(UserMapper.INSTANCE.toEntity(user));
  }
}
