<p align="center">
 <img src="https://qph.cf2.quoracdn.net/main-qimg-62be9fb6e1d7166e9cbeeed913096752" height="250" width="250">  </p>
 <h1 align="center">CSV Coordinates</h1>
<p align="center">
</p>
Backend application using Java language.

### Description 
---
O arquivo data/eventlog.csv presente neste diretório contém um registro de eventos recebidos
pelo nosso servidor de comunicação. Os eventos são enviados continuamente pelos rastreadores
instalados nos ônibus da frota da empresa "ACME". Os eventos estão ordenados cronologicamente,
mais recentes primeiro. Todas as linhas do arquivo csv de entrada têm todos os campos indicados
no cabeçalho.

Usando como exemplo a primeira linha de dados no arquivo data/eventlog.csv:

	3182,RUS00,2018-12-10T10:55:40-02:00,">RUS00,101218095501,-23.70041,-046.53713<",acme

	3182 é o código do rastreador veicular que enviou o evento.

	RUS00 é um identificador do tipo do evento.

	2018-12-10T10:55:40-02:00 representa o instante em que o rastreador gerou o evento, no formato ISO8601

	">RUS00,101218095501,-23.70041,-046.53713<": é o conteúdo original do evento, que segue um protocolo próprio do rastreador. As informações de latitude e longitude devem ser extraídas desse campo.

	acme é o nome da empresa de ônibus dona do rastreador.

A tarefa consiste em implementar uma ferramenta de linha de comando que permita responder a seguinte pergunta
a partir dos dados presentes no arquivo CSV:

	* Dado um par de coordenadas em formato latitude,longitude retornar todos os eventos
	  que tenham sido gerados nas proximidades da coordenada informada. Considerar como "próximos"
	  todos os eventos gerados dentro de um círculo com raio de 50 metros e centro na coordenada
	  informada na linha de comando. Retornar os eventos agrupados por dispositivo e ordenados
	  cronológicamente dentro do grupo, mais antigos primeiro. Cada registro de saída deve conter:
	  o código do dispositivo, a distancia do evento até o ponto informado, a data/hora do evento
	  em formato ISO8601 e o payload do evento. Ex de chamada:

		./csv-search --location -23.70041,-46.53713
		
A ferramenta a ser implementada deve exibir os resulados no formato csv. 

O arquivo data/eventlog.csv contém eventos gerados durante um período de aproximadamente uma hora.
Durante a implementação, considere a possibilidade de que o arquivo de entrada pode conter eventos
gerados durante até uma semana, com aproximadamente a mesma taxa de eventos por segundo com relação
ao arquivo de exemplo.

Ao desenvolver sua solução, leve em conta que a funcionalidade implementada por essa
ferramenta deverá ser disponibilizada, no futuro, através de uma API HTTP ou equivalente, então a 
modularidade do código e a possibilidade de se adicionar alguma forma de controle de concorrência
(caso necessário).
### Starting
```bash
# Clone this project
$ git clone https://github.com/JenniferFariasRodrigues/csv_coordinates_Java.git

# Access on Eclipse IDE
On the IDE Eclipse choose the option "Import projects". On the folder "General" choose "Existing Projects into workspace" and choose  csv_coordinates_Java folder.

# Choose folder in IDE and run the project
On the terminal, on the file path(csv_coordinates/src/main/java/com/csv_coordinates/csv_coordinates), run the code:
$ mvn spring-boot:run
Or click on "Run" in the Window.


```

---
### Output
On your terminal put this command:

http://localhost:8080/search?latitude=-23.70041&longitude=-46.53713
--
The expected output is:
```bash

[
    {
        "deviceId": "3305",
        "distance": 16.652592461887693,
        "timestamp": "2018-12-10T09:58:00-02:00",
        "payload": {
            "type": "RUS00",
            "date": "10/12/2018",
            "time": "08:57:59",
            "latitude": -23.70038,
            "longitude": -46.53697
        }
    },
    {
        "deviceId": "3305",
        "distance": 23.623046541428987,
        "timestamp": "2018-12-10T09:58:50-02:00",
        "payload": {
            "type": "RUS00",
            "date": "10/12/2018",
            "time": "08:58:29",
            "latitude": -23.70032,
            "longitude": -46.53734
        }
    },
    {
        "deviceId": "3170",
        "distance": 46.9658015506663,
        "timestamp": "2018-12-10T10:17:50-02:00",
        "payload": {
            "type": "RAX12",
            "date": "10/12/2018",
            "time": "09:17:34",
            "latitude": -23.70039,
            "longitude": -46.53759
        }
    },
    {
        "deviceId": "3166",
        "distance": 9.284046196078538,
        "timestamp": "2018-12-10T10:19:03-02:00",
        "payload": {
            "type": "RUS00",
            "date": "10/12/2018",
            "time": "09:19:01",
            "latitude": -23.70045,
            "longitude": -46.53705
        }
    },
    {
        "deviceId": "3203",
        "distance": 48.04841777460559,
        "timestamp": "2018-12-10T10:30:44-02:00",
        "payload": {
            "type": "RUS00",
            "date": "10/12/2018",
            "time": "09:30:31",
            "latitude": -23.70038,
            "longitude": -46.5376
        }
    },
    {
        "deviceId": "3001",
        "distance": 45.21420719231751,
        "timestamp": "2018-12-10T10:37:06-02:00",
        "payload": {
            "type": "RAX12",
            "date": "10/12/2018",
            "time": "09:37:02",
            "latitude": -23.70046,
            "longitude": -46.53757
        }
    },
    {
        "deviceId": "3203",
        "distance": 26.348248804392796,
        "timestamp": "2018-12-10T10:43:26-02:00",
        "payload": {
            "type": "RUS00",
            "date": "10/12/2018",
            "time": "09:43:25",
            "latitude": -23.70035,
            "longitude": -46.53738
        }
    },
    {
        "deviceId": "3164",
        "distance": 49.15331030276093,
        "timestamp": "2018-12-10T10:54:20-02:00",
        "payload": {
            "type": "RAX12",
            "date": "10/12/2018",
            "time": "09:54:17",
            "latitude": -23.70037,
            "longitude": -46.53761
        }
    },
    {
        "deviceId": "3164",
        "distance": 7.874345897394076,
        "timestamp": "2018-12-10T10:54:32-02:00",
        "payload": {
            "type": "RUS00",
            "date": "10/12/2018",
            "time": "09:54:31",
            "latitude": -23.70044,
            "longitude": -46.53706
        }
    },
    {
        "deviceId": "3182",
        "distance": 0.0,
        "timestamp": "2018-12-10T10:55:40-02:00",
        "payload": {
            "type": "RUS00",
            "date": "10/12/2018",
            "time": "09:55:01",
            "latitude": -23.70041,
            "longitude": -46.53713
        }
    }
]




```
