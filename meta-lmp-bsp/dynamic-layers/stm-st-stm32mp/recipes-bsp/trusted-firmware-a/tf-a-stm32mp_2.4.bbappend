FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-stm32mp1-save-boot-auth-status-and-partition-info.patch \
    file://0002-stm32mp1-check-for-fip-a-fip-b-partitions.patch \
"
