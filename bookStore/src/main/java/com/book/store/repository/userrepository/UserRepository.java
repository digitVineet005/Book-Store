package com.book.store.repository.userrepository;

import com.book.store.model.usermodel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
