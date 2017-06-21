#!/bin/sh

/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
brew tap caskroom/cask
brew cask install virtualbox
brew cask install vagrant

vagrant plugin install vagrant-docker-compose
