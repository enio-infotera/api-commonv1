package br.com.infotravel.api.commonv1.enumerators;

public enum AttachmentType {
    VOUCHER,
    CONFIRMATION,
    CONTRACT,
    RECEIPT;

    AttachmentType() {
    }

    public static AttachmentType getEnum(Integer enumeratorId) {

        if (enumeratorId.equals(10)) {
            return AttachmentType.VOUCHER;
        } else if (enumeratorId.equals(4)) {
            return AttachmentType.CONFIRMATION;
        } else if (enumeratorId.equals(1)) {
            return AttachmentType.CONTRACT;
        } else if (enumeratorId.equals(11)) {
            return AttachmentType.RECEIPT;
        }
        return null;
    }
}
