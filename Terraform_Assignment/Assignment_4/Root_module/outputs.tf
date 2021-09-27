output "ip" {
  value = "${module.ghost.ip_address}"
}

output "container_name" {
  value = "${module.ghost.container_name}"
}