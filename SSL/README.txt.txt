.keystore file is the cert genereated by keytool provided by jdk.
It is used to enable SSL on tomcat.
Modify server.xml as:
<Connector SSLEnabled="true" acceptCount="100" clientAuth="false"
    disableUploadTimeout="true" enableLookups="false" maxThreads="25"
    port="8443" keystoreFile="C:/Users/asingh64/.keystore" keystorePass="changeit"
    protocol="HTTP/1.1" scheme="https"
    secure="true" sslProtocol="TLS" />