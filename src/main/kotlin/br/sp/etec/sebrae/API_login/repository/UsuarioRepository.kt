package br.sp.etec.sebrae.API_login.repository

import br.sp.etec.sebrae.API_login.entity.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : JpaRepository<Usuario, Long> {
}