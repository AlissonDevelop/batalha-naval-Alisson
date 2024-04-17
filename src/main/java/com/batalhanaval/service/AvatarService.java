package com.batalhanaval.service;

import com.batalhanaval.entity.Avatar;
import com.batalhanaval.repository.AvatarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvatarService {

    private final AvatarRepository avatarRepository;

    public AvatarService(AvatarRepository avatarRepository) {
        this.avatarRepository = avatarRepository;
    }

    public Avatar saveAvatar(Avatar avatar) {
        return this.avatarRepository.save(avatar);
    }

    public Avatar getAvatar(Long avatarId) {
        return this.avatarRepository.findById(avatarId).orElse(null);
    }

    public List<Avatar> getAvatar() {
        return this.avatarRepository.findAll();
    }

    public void deleteAvatar(Long avatarId) {
        this.avatarRepository.deleteById(avatarId);
    }
}
