package mutsa.api.dto.payment;

import lombok.Builder;
import lombok.Getter;
import mutsa.common.domain.models.payment.Receipt;

@Getter
@Builder
public class ReceiptResponseDto {
    String mId;             // 가맹점 ID. 고유 식별자
    String version;         // API 버전
    String paymentKey;      // 결제 키. 결제 식별자
    String orderId;         // 주문 ID. Toss API 호출 키
    String orderName;       // 주문 이름
    String currency;        // 화폐 단위
    String method;          // 결제 방식
    String totalAmount;     // 총 결제 금액
    String balanceAmount;   // 잔액. 결제 후 남은 금액
    String suppliedAmount;  // 공급 가격. 부가세를 제외한 실제 상품/서비스의 가격
    String vat;             // 부가세
    String status;          // 결제 상태
    String requestedAt;     // 결제 요청 시각
    String approvedAt;      // 결제 승인 시각
    String useEscrow;       // 에스크로 사용 여부
    String cultureExpense;  // 문화비 지출 여부
    ReceiptCardResponseDto card; // 카드 결제 내역
    String type;            // 결제 유형

    public void setCard(ReceiptCardResponseDto card) {
        this.card = card;
    }

    public static ReceiptResponseDto of(Receipt receipt) {
        return ReceiptResponseDto.builder()
                .mId(receipt.getMid())
                .version(receipt.getVersion())
                .paymentKey(receipt.getPaymentKey())
                .orderId(receipt.getOrderId())
                .orderName(receipt.getOrderName())
                .currency(receipt.getCurrency())
                .method(receipt.getMethod())
                .totalAmount(receipt.getTotalAmount())
                .balanceAmount(receipt.getBalanceAmount())
                .suppliedAmount(receipt.getSuppliedAmount())
                .vat(receipt.getVat())
                .status(receipt.getStatus())
                .requestedAt(receipt.getRequestedAt())
                .approvedAt(receipt.getApprovedAt())
                .useEscrow(receipt.getUseEscrow())
                .cultureExpense(receipt.getCultureExpense())
                .type(receipt.getType())
                .build();
    }
}
