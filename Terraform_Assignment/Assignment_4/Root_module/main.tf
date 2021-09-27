module "ghost" {
  source = "C:/navya_docs/Cg Assignments/Terraform/Terraform_Assignment/Assignment_4/Ghost_module"
  image_name = "${var.image_name}"
  container_name = "${var.container_name}"
  ext_port = "${var.ext_port}"
}