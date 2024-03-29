package com.bits.bits.repository;

import com.bits.bits.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Long> {
    Optional<AdminModel> findUserByEmail(String email);

    Optional<AdminModel> findById(long userId);

    List<AdminModel> findByNameContainingIgnoreCase(String name);
}
