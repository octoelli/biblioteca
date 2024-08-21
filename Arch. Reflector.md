Reflector
The last step is to enable the reflector timer to run this once a week:

sudo systemctl enable --now reflector.timer

check if it is running:

systemctl status reflector.timer

EndeavourOS mirrors can now be ranked with a terminal command (note: call without sudo!)

eos-rankmirrors
