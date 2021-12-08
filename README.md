<p align="center"><img src="logo.gif" width="434px"></p>

<h1 align="center">Asteroide-API</h1>

<h3 align="center">
 API REST de código aberto para dados de pesquisa e referência organizacional de informações ela foi desenvolvida usando como base o sistema de CRUD</h3>

<p align="center">
<a href="https://www.travis-ci.com/github/Mario23junior/Jurassic-API/pull_requests"><img src="https://img.shields.io/github/workflow/status/r-spacex/SpaceX-API/Test?style=flat-square"></a>
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square"></a>
</p>

## Etapas para testar ou reproduzir

## Em seguida faça
```
Executo o projeto a saide e algo como publicando serviço na URL : http://localhost:8085/sol?wsdl

```
## Para obter mais detalhes da documentação acesso o swagger
```
http://localhost:8085/sol?wsdl
```

## Uso
## Resultado dos dados da API

```
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:Listando xmlns:ns2="http://mapperService.solApi.com.br/">
         <ListaCientifica>
            <id>1</id>
            <magnitude_aparente>(V)−26,74</magnitude_aparente>
            <metalicidade>0.0177</metalicidade>
            <adjetivo>code Solar</adjetivo>
            <raio_equatorial>6,963×108 m</raio_equatorial>
            <obliquidade>7.25</obliquidade>
            <declinacao>+63,87°</declinacao>
            <tipo>Estrella</tipo>
         </ListaCientifica>
      </ns2:Listando>
   </S:Body>
</S:Envelope>
```
