import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return item by id=1"

    request {
        url "/items/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                id: 1,
                type: "fruit"
        )
    }
}

