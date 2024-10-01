# Kafe Web Spring

### Nisit Info
```
ID: 6510405521
Name: Thatpong Wongchaita
```

### Setup Database using Docker
```bash
docker run --name=postgres_kafe -e POSTGRES_PASSWORD=kafepwd -p 6543:5432 -d postgres:alpine
```