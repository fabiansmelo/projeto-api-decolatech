package dio.projetoapi.services;

import dio.projetoapi.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}