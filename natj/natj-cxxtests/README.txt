Testing on Windows uses Ansible

For setup information please visit:
    http://docs.ansible.com/ansible/intro_windows.html

You need to configure the 'win-test-servers' hosts.

Example /usr/local/etc/ansible/hosts:

    [win-test-servers]
    172.16.12.100 ansible_user=<username> ansible_password=<password> ansible_port=5986 ansible_connection=winrm ansible_winrm_server_cert_validation=ignore

PowerShellCommunityExtensions (PSCX) Module is needed on the target Windows machine!
This testing method was done from an OS X host with a Windows 10 target.

Tests can be run from Gradle using:
    ./gradlew natj-cxxtests:ansibleTestWin
