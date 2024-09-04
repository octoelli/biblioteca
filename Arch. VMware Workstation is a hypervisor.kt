Vamos ver como instalar facilmente o VMware Workstation Pro / Player no Arch Linux. VMware Workstation é um hipervisor usado para executar vários sistemas operacionais em um único PC Linux ou Windows.

Ele permite que desenvolvedores e usuários configurem máquinas virtuais em uma única máquina física e as executem simultaneamente junto com o sistema operacional host. Existem dois tipos distintos de VMware Workstation: edição Pro e edição Player.

Etapa 1: Instalar o paru AUR helper
Comece instalando um auxiliar AUR inteligente chamado paru.

git clone https://aur.archlinux.org/paru-bin
cd paru-bin/
makepkg -si
Etapa 2: instalar dependências
Instale todas as dependências necessárias para executar o VMware Workstation no Arch Linux.

sudo pacman -S fuse2 gtkmm linux-headers pcsclite libcanberra
O outro pacote necessário para o instalador –console é ncurses5-compat-libs. Isso está disponível no AUR.

paru -S --noconfirm --needed ncurses5-compat-libs
Etapa 3: Instalar o VMware Workstation Pro ou Player
O pacote vmware-workstation está disponível no AUR e pode ser instalado executando o comando.

paru -S --noconfirm --needed  vmware-workstation
Em seguida, conforme desejado, habilite alguns dos seguintes serviços:

vmware-networks.service para acesso à rede de convidados
vmware-usbarbitrator.service para conectar dispositivos USB ao convidado
Exemplo:
sudo systemctl enable vmware-networks.service  vmware-usbarbitrator.service 
sudo systemctl start vmware-networks.service  vmware-usbarbitrator.service 
Confirme o status dos serviços com:
sudo systemctl status vmware-networks.service  vmware-usbarbitrator.service 
Por fim, carregue os módulos VMware:
sudo modprobe -a vmw_vmci vmmon
Para iniciar o VMware Workstation, execute:
# Launch VMware Workstation Pro:
vmware
# Launch VMware Workstation Player
vmplayer
