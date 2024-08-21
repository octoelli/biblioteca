<h1>Failed to start Virtual console Setup error message</h1>
*eu achei esse erro apenas na dsitribuição Crystal linux (virtual box)

Eu estava tentando consertar um teclado sem fio com mau comportamento,
então encontrei uma falha no vconsole.setup. Consigo corrigi-lo alterando e reinstalando o KEYMAP=us

Deixar assim:<p>

$ sudo nano /etc/vconsole.conf<p>
KEYMAP=us<p>
$sudo mkinitcpio -P<p>
<p>
Saida:<p>
<p>
$ cat /etc/vconsole.conf<p>
KEYMAP=us<p>

