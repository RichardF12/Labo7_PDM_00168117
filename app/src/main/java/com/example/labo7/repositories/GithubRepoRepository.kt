package com.example.labo7.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.labo7.daos.GithubRepoDAO
import com.example.labo7.entities.GithubRepo

class GithubRepoRepository(private val repoDAO: GithubRepoDAO){

    fun getAll():LiveData<List<GithubRepo>> = repoDAO.getAll()

    fun nuke() = repoDAO.nukeTable()

    @WorkerThread
    suspend fun insert(repo:GithubRepo) = repoDAO.insert(repo)


}