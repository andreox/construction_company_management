import ClienteService from '~/assets/service/ClienteService'

export default (ctx, inject) => {
  const services = {
    cliente: new ClienteService(ctx.$axios)
  }

  inject('services', services)
}