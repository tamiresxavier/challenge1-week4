db.Person.insertOne({
    name: "Tamires Xavier",
    age: 25,
    phone: "(11) 1234-5678",
    height: 1.62,
    email: "tamires@gmail.com",
    cpf: "123.456.789-00",
    date_birth: ISODate("1997-09-07T00:00:00.000Z"), 
    address: {
      cep: "01234-567",
      street: "Flowers Street",
      neighborhood: "Garden of Palms",
      complement: "Apto 56",
      city: "São Paulo",
      status: "SP",
      country: "Brazil"
    }
  });