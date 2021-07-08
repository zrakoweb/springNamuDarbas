package com.example.springnamudarbas.services;

import com.example.springnamudarbas.entities.Post;
import com.example.springnamudarbas.repositories.PostRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public List<Post> findAll() {
        return postRepository.findAll();
    }
    public List<Post> findLatest5(){
        return postRepository.findLatest5Posts(PageRequest.of(0,5));
    }
    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }
    public Post create(Post post){
        return postRepository.save(post);
    }
    public Post edit(Post post){
        return postRepository.save(post);
    }
    public void deleteById(Long id){
        postRepository.deleteById(id);
    }
}
