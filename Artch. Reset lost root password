Usando o sudo

Se você instalou o sudo e configurou permissões para o grupo wheel ou um usuário cuja senha você se lembra, você pode alterar a senha do root executando sudo passwd root.
Usando o shell de depuração

    Anexe systemd.debug_shell aos parâmetros do kernel.
    Isso vai fazer uma inicialização normal, mas inicia debug-shell.service, o qual executa um shell de root (/bin/sh) no tty9. Pressione Ctrl+Alt+F9 para acessá-lo.
    Use o comando passwd para criar uma nova senha para o usuário root.
    Quando finalizar, pare debug-shell.service.

Usando bash como init

    Anexe o parâmetro do kernel init=/bin/bash à entrada de inicialização do seu gerenciador de boot.
    Seu sistema de arquivos raiz está montado como somente leitura agora, então remonte-o como leitura/escrita: mount -n -o remount,rw /.
    Use o comando passwd para criar uma nova senha para o usuário root.
    Reinicialize digitando reboot -f e não perca sua senha novamente!

Nota: Alguns teclados podem não ser carregados corretamente pelo sistema init com este método e você não poderá digitar nada no prompt do bash. Se for esse o caso, você terá que usar outro método.
Usando um LiveCD

Com um LiveCD, alguns métodos estão disponíveis: alterar a raiz e usar o comando passwd, ou apagar a entrada do campo da senha diretamente editando o arquivo de senha. Qualquer LiveCD compatível com Linux pode ser usado, embora para mudar de raiz deve corresponder ao tipo de arquitetura instalada. Aqui, descrevemos apenas como redefinir sua senha com chroot, uma vez que a edição manual do arquivo de senha é significativamente mais arriscada.
Alterando a raiz

    Inicie o LiveCD e monte a partição raiz de seu sistema principal.
    Use o comando passwd --root PONTO_DE_MONTAGEM NOME_USUÁRIO para definir a nova senha (você não será perguntado sobre a anterior).
    Desmonte a partição raiz.
    Reinicie e insira sua nova senha.

Veja também: https://wiki.archlinux.org/title/Reset_lost_root_password_(Portugu%C3%AAs)
