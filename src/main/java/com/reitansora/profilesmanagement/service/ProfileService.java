package com.reitansora.profilesmanagement.service;

import com.reitansora.profilesmanagement.entity.ProfileEntity;
import com.reitansora.profilesmanagement.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Service class for managing profile-related operations.
 */
@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    /**
     * Constructs a ProfileService with the given ProfileRepository.
     *
     * @param profileRepository the user repository
     */
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    /**
     * Retrieves all profiles from the repository.
     *
     * @return a list of all profiles
     */
    public ArrayList<ProfileEntity> getAllProfiles() {
        return (ArrayList<ProfileEntity>) profileRepository.findAll();
    }

}
