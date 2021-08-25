package br.com.marco.apigithub.data.repositories

import br.com.marco.apigithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}