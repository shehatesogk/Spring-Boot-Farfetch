package com.example.farfetch.Repository;

import com.example.farfetch.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Integer> {
}
