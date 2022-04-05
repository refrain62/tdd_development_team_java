package auth_lib;

/**
 * 認証ライブラリ IF
 */
public interface Authenticator
{
    /**
     * 認証処理
     * @param authp 認証用パラメータ
     * @return 認証結果
     */
    boolean auth( AuthParameters authp );
}
