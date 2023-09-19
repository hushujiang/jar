package com.github.catvod.spider.merge.p042j;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.OkHttpClient;

/* renamed from: com.github.catvod.spider.merge.j.b */
/* loaded from: classes.dex */
public final class C0574b {

    /* renamed from: a */
    private final OkHttpClient f1040a;

    /* renamed from: b */
    private final OkHttpClient f1041b;

    public C0574b() {
        Dns dns;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dns = (Dns) Spider.class.getMethod(atm.m897d("191B1C10083619"), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            dns = Dns.SYSTEM;
        }
        OkHttpClient.Builder dns2 = builder.dns(dns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder connectTimeout = dns2.readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).connectTimeout(30L, timeUnit);
        X509TrustManager x509TrustManager = C0579g.f1053b;
        OkHttpClient build = connectTimeout.hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.j.e
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                X509TrustManager x509TrustManager2 = C0579g.f1053b;
                return true;
            }
        }).sslSocketFactory(new C0579g(), C0579g.f1053b).build();
        this.f1041b = build;
        this.f1040a = build.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    /* renamed from: a */
    public static OkHttpClient m312a() {
        return C0573a.f1039a.f1041b;
    }

    /* renamed from: b */
    public static String m311b(Map<String, List<String>> map) {
        String m897d = atm.m897d("0615191438310514");
        if (!map.containsKey(m897d)) {
            m897d = atm.m897d("2615191438310514");
            if (!map.containsKey(m897d)) {
                return null;
            }
        }
        return map.get(m897d).get(0);
    }

    /* renamed from: c */
    public static String m310c(String str, Map<String, String> map, Map<String, String> map2) {
        return m306g(C0573a.f1039a.f1041b, atm.m897d("3A352921"), str, map, map2, null);
    }

    /* renamed from: d */
    public static C0576d m309d(String str, String str2, Map<String, String> map) {
        return new C0575c(str, str2, map).m304a(C0573a.f1039a.f1041b);
    }

    /* renamed from: e */
    public static String m308e(String str, Map<String, String> map) {
        return m307f(str, map, null);
    }

    /* renamed from: f */
    public static String m307f(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m306g(C0573a.f1039a.f1041b, atm.m897d("2D3F2E"), str, null, map, map2);
    }

    /* renamed from: g */
    public static String m306g(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2, Map map3) {
        C0575c c0575c = new C0575c(str, str2, map, map2, map3);
        c0575c.m303b();
        return c0575c.m304a(okHttpClient).m302a();
    }

    /* renamed from: h */
    public static void m305h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        m306g(C0573a.f1039a.f1040a, atm.m897d("2D3F2E"), str, null, map, map2);
    }
}
