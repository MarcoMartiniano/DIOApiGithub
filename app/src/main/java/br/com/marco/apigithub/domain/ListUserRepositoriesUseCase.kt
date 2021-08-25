package br.com.marco.apigithub.domain

import br.com.marco.apigithub.core.UseCase
import br.com.marco.apigithub.data.model.Repo
import br.com.marco.apigithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}