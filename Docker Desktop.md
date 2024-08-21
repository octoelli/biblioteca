Para instalar o Docker (depois de instalar o WSL):

Baixe o Docker Desktop e siga as instruções de instalação.

Depois de instalado, inicie o Docker Desktop no menu Iniciar do Windows

Verifique se “Usar o mecanismo baseado em WSL 2” está marcado em Configurações > Gerais.

Selecione entre as distribuições do WSL 2 instaladas nas quais você deseja habilitar a integração do Docker acessando: Configurações > Recursos > Integração do WSL

Para confirmar se o Docker foi instalado, abra uma distribuição do WSL (por exemplo, Ubuntu) e exiba a versão e o número do build inserindo: docker --version

Teste se a instalação funciona corretamente executando uma imagem interna simples do Docker usando: docker run hello-world

[contêineres remotos usando o VS Code](https://learn.microsoft.com/pt-br/windows/wsl/tutorials/wsl-containers#develop-in-remote-containers-using-vs-code)
