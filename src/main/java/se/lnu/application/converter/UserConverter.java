package se.lnu.application.converter;

import org.springframework.stereotype.Component;
import se.lnu.application.dto.UserDTO;
import se.lnu.application.entity.UserEntity;

@Component
public class UserConverter implements Converter<UserEntity, UserDTO> {

    @Override
    public UserEntity convertToEntity(UserDTO dto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(dto.getId());
        userEntity.setLogin(dto.getLogin());
        userEntity.setName(dto.getName());
        userEntity.setPassword(dto.getPassword());
        userEntity.setRole(dto.getRole());
        return userEntity;
    }

    @Override
    public UserDTO convertToDTO(UserEntity entity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(entity.getId());
        userDTO.setLogin(entity.getLogin());
        userDTO.setName(entity.getName());
        userDTO.setPassword(entity.getPassword());
        userDTO.setRole(entity.getRole());
        return userDTO;
    }

}
