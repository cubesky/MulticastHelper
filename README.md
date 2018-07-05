# Multicast Helper
A Java library to make your multicast easiler

## Install
You can use `CubeSky Repo` ([https://cubesky-mvn.github.io](https://cubesky-mvn.github.io)) to import this library.

## API
### Without party.liyin.multicasthelper.MulticastHelper Object
#### party.liyin.multicasthelper.MulticastHelper.sendMulticast(String,int,byte[])
Send data without new a party.liyin.multicasthelper.MulticastHelper Object.

### With party.liyin.multicasthelper.MulticastHelper Object
First, you need new a Multicast Helper Object. Give it a multicast host and a port.

```java
MulticastHelper helper = new MulticastHelper("224.224.224.2",9999)
```

Then you can use api to access multicast helper

#### helper.sendMulticast(byte[])
Send multicast data

#### helper.setCallback(MulticastCallback)
Set a callback to receive multicast data.

#### helper.receiveMulticast()
Start to receive Multicast

#### helper.receiveMulticast(NetworkInterface)
Start to receive Multicast on specified interface

#### helper.close()
Interrupt all connection and close socket, you can use `receiveMulticast` to restart a receive.

## LICENSE
MIT License