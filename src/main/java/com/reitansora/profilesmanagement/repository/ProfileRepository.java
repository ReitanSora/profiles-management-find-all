package com.reitansora.profilesmanagement.repository;

import com.reitansora.profilesmanagement.entity.ProfileEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
    Optional<ProfileEntity> findByUserId(@NotNull(message = "User ID cannot be null") String userId);
}
