package com.example.questfirebase_015.repositori

interface ContainerApp {
    val repositorySiswa: RepositorySiswa
}

class DefaultContainerApp : com.example.myfirebase.repositori.ContainerApp {
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}