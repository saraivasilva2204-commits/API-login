package br.sp.etec.sebrae.API_login.controller

import br.sp.etec.sebrae.API_login.entity.Usuario
import br.sp.etec.sebrae.API_login.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class UsuarioController {

    @Autowired
    var repository : UsuarioRepository? = null

    @PostMapping("/cadastro")
    fun cadastrarUsuario(@RequestBody usuario: Usuario): ResponseEntity<Usuario> {

        return ResponseEntity.ok(repository!!.save(usuario))
    }

}