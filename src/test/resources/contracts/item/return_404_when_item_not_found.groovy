import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return http status 404 when item doesn't exist"

    request {
        url "/items/404"
        method GET()
    }

    response {
        status NOT_FOUND()
    }
}