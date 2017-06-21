@powershell -NoProfile -ExecutionPolicy Bypass -Command "iex ((new-object net.webclient).DownloadString('https://chocolatey.org/install.ps1'))" && SET PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin

choco install virtualbox -y
choco install virtualbox.extensionpack -y
choco install vagrant -y

vagrant plugin install vagrant-docker-compose
vagrant plugin install vagrant-vbguest
