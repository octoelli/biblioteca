Como instalar o yay no Arch Linux
O pacote yay está disponível apenas no Arch User Repository. Observe que você pode instalar manualmente os pacotes do AUR sem usar um auxiliar AUR (semelhante a como instalaremos yay abaixo), mas como o nome sugere, um “auxiliar AUR” ajuda você no processo de instalação, tornando mais fácil para você. você instale pacotes com o mínimo de interação do usuário.

Para instalar o yay em seu desktop Arch, primeiro baixe as seguintes dependências:

sudo pacman -S --needed base-devel git

Em seguida, clone o repositório yay usando o comando git clone:

git clone https://aur.archlinux.org/yay.git

Altere seu diretório de trabalho atual para aquele que você acabou de baixarVivapasta usando o comando cd:

cd yay

Finalmente, use o comando makepkg para compilar e instalar yay:

makepkg -si

Se o comando acima lançar o erro “cannot find fakeroot binary”, verifique se você instalou corretamente odesenvolvimento básicopacote e, em seguida, execute o comando novamente.

Além do Arch Linux, esse método também funciona para outras distribuições baseadas no Arch, incluindo Manjaro, EndeavourOS e Garuda Linux.
