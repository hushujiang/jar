package com.github.catvod.spider.merge.p042j;

import com.github.catvod.spider.merge.atm;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.github.catvod.spider.merge.j.g */
/* loaded from: classes.dex */
public final class C0579g extends SSLSocketFactory {

    /* renamed from: b */
    public static final X509TrustManager f1053b = new C0578f();

    /* renamed from: c */
    static String[] f1054c;

    /* renamed from: d */
    static String[] f1055d;

    /* renamed from: a */
    private final SSLSocketFactory f1056a;

    static {
        String[] supportedProtocols;
        f1054c = null;
        f1055d = null;
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains(atm.m897d("392936"))) {
                        linkedList.add(str);
                    }
                }
                f1054c = (String[]) linkedList.toArray(new String[linkedList.size()]);
                List asList = Arrays.asList(atm.m897d("3E36292A1E0B2B252D3C1810353B3F26136A5F4C25320F15352932347F605E"), atm.m897d("3E36292A1E0B2B252D3C1810353B3F261369584225320F15352932347E6D5C"), atm.m897d("3E36292A091B2E323F2A091B2E293B2A1B113E322534090B354B484D131B283925260419584F4C"), atm.m897d("3E36292A091B2E323F2A091B2E293B2A1B113E322534090B354B484D131F293725260419584F4C"), atm.m897d("3E36292A091B2E323F2A091B2E293B2A1B113E322534090B35484F43131F29372526041959424E"), atm.m897d("3E36292A091B2E323F2A1E0B2B252D3C1810353B3F261369584225360E1B352932347E6D5C"), atm.m897d("3E36292A091B223E3F2A1E0B2B252D3C1810353B3F261369584225320F15352932347E6D5C"), atm.m897d("3E36292A1E0B2B252D3C181035493E301F072F3E3F2A0F1A2925293D0D"), atm.m897d("3E36292A1E0B2B252D3C1810353B3F261369584225360E1B35293234"), atm.m897d("3E36292A1E0B2B252D3C1810353B3F26136A5F4C25360E1B35293234"), atm.m897d("3E36292A091B2E323F2A091B2E293B2A1B113E322546081D39253F3109072938392A1F102B"), atm.m897d("3E36292A091B2E323F2A091B2E293B2A1B113E322534090B354B484D131B283925260419"), atm.m897d("3E36292A091B2E323F2A1E0B2B252D3C181035493E301F072F3E3F2A0F1A2925293D0D"), atm.m897d("3E36292A091B2E323F2A1E0B2B252D3C1810353B3F261369584225360E1B35293234"));
                List asList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                HashSet hashSet = new HashSet(asList);
                hashSet.retainAll(asList2);
                hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                f1055d = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C0579g() {
        try {
            SSLContext sSLContext = SSLContext.getInstance(atm.m897d("3E3629"));
            sSLContext.init(null, new X509TrustManager[]{f1053b}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            this.f1056a = socketFactory;
            HttpsURLConnection.setDefaultSSLSocketFactory(socketFactory);
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private void m300a(SSLSocket sSLSocket) {
        String[] strArr = f1054c;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = f1055d;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f1056a.createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            m300a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f1056a.createSocket(str, i, inetAddress, i2);
        if (createSocket instanceof SSLSocket) {
            m300a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f1056a.createSocket(inetAddress, i);
        if (createSocket instanceof SSLSocket) {
            m300a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f1056a.createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket instanceof SSLSocket) {
            m300a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f1056a.createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            m300a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return f1055d;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return f1055d;
    }
}
