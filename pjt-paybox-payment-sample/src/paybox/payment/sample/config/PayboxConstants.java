package paybox.payment.sample.config;

public class PayboxConstants {
	/// <summary>
    /// 파트너사에 부여 받은 Partner API Id ('[비지니스 설정] >> [API]' 에서 확인 가능)
    /// </summary>
	public static String PARTNER_API_ID = "tyjxh7dgeiupq1l1hymmzbo6hhhx8kb4";
	/// <summary>
    /// 파트너사에 부여 받은 Partner API Key ('[비지니스 설정] >> [API]' 에서 확인 가능)
    /// </summary>
	public static String PARTNER_API_KEY = "dGd0N2tlaWlicm5laDgycjJidjNybDJ1emsxeTM0a20=";
	/// <summary>
    /// 결제 정보 암호화 URL
    /// </summary>
	public static String PAYMENT_ENCRYPT_URL = "http://devapi.paybox.store/Payment/Encrypt"; //개발 서비스 환경
    //public const string PAYMENT_ENCRYPT_URL = "https://api.paybox.store/Payment/Encrypt"; //운영 서비스 환경
    /// <summary>
    /// 결제 창 호출 URL
    /// </summary>
	public static String REQUEST_PAYMENT_URL = "http://devapi.paybox.store/Payment/Request/Redirect/%s"; //개발 서비스 환경
    //public const string REQUEST_PAYMENT_URL = "https://api.paybox.store/Payment/Request/Redirect/%s"; //운영 서비스 환경
    /// <summary>
    /// 결제 창 호출 URL(위챗공중계정 - PaymentType이 3인 경우에만 사용가능하며, 위챗 앱내에서만 페이지 활성화)
    /// </summary>
    //public const string REQUEST_PAYMENT_WECHAT_URL = "http://devapi.paybox.store/Payment/Request/OAuth/%s"; //개발 서비스 환경
    //public const string REQUEST_PAYMENT_WECHAT_URL = "https://api.paybox.store/Payment/Request/OAuth/%s"; //운영 서비스 환경
	/// <summary>
    /// 결제 API 토큰 생성 URL
    /// </summary>
	public static String CREATE_TOKEN_URL = "http://devapi.paybox.store/Create/Token"; //개발 서비스 환경
    //private const string CREATE_TOKEN_URL = "https://api.paybox.store/Create/Token"; //운영 서비스 환경
    /// <summary>
    /// 결제 취소 API
    /// </summary>
	public static String CANCEL_PAYMENT_URL = "http://devapi.paybox.store/Api/Payment/Cancel"; //개발 서비스 환경
    //private const string CANCEL_PAYMENT_URL = "https://api.paybox.store/Api/Payment/Cancel"; //운영 서비스 환경
}
