Enable snapd
On Arch Linux, snap can be installed from the Arch User Repository (AUR). 
The manual build process is the Arch-supported install method for AUR packages, and you’ll need the prerequisites installed before you can install any AUR package. 
You can then install snap with the following:

git clone https://aur.archlinux.org/snapd.git
cd snapd
makepkg -si
Once installed, the systemd unit that manages the main snap communication socket needs to be enabled:

sudo systemctl enable --now snapd.socket
If AppArmor is enabled in your system, enable the service which loads AppArmor profiles for snaps:

sudo systemctl enable --now snapd.apparmor.service
To enable classic snap support, enter the following to create a symbolic link between /var/lib/snapd/snap and /snap:

sudo ln -s /var/lib/snapd/snap /snap
Either log out and back in again, or restart your system, to ensure snap’s paths are updated correctly.

Install Snap Store
To install Snap Store, simply use the following command:

sudo snap install snap-store
