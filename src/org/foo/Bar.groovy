package org.foo

class Bar implements Serializable {
    def script

    Bar(script) {
        this.script = script
    }

    def sayHello(String name = 'World') {
        script.echo "Hello, ${name} from Bar class!"
    }
}
