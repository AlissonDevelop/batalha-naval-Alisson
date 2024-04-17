package com.batalhanaval.controller;

import com.batalhanaval.entity.Avatar;
import com.batalhanaval.service.AvatarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("avatares")
public class AvatarController {

    private final AvatarService avatarService;

    public AvatarController(AvatarService avatarService) {
        this.avatarService = avatarService;
    }

    @PostMapping
    public ResponseEntity<Avatar> addAvatar(@RequestBody Avatar avatar) {
        avatar = this.avatarService.saveAvatar(avatar);

        return ResponseEntity.status(HttpStatus.CREATED).body(avatar);
    }

    @GetMapping("{avatarId}")
    public ResponseEntity<Avatar> getAvatar(@PathVariable Long avatarId) {
        Avatar avatar = this.avatarService.getAvatar(avatarId);

        return ResponseEntity.ok(avatar);
    }

    @GetMapping
    public ResponseEntity<List<Avatar>> getAvatar() {
        List<Avatar> avatar = this.avatarService.getAvatar();

        return ResponseEntity.ok(avatar);
    }

    @DeleteMapping("{avatarId}")
    public void deleteAvatar(@PathVariable Long avatarId) {
        this.avatarService.deleteAvatar(avatarId);
    }

}
