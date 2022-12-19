package med.voll.api.medico;

public record DadosListagemMedicos(Long id, String nome, String email, String crw, Especialidade especialidade) {
    public DadosListagemMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrw(), medico.getEspecialidade());
    }
}
