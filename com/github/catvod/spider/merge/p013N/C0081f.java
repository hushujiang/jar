package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p056r.C0653a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* renamed from: com.github.catvod.spider.merge.N.f */
/* loaded from: classes.dex */
public final class C0081f {

    /* renamed from: a */
    private final int f127a;

    /* renamed from: b */
    private final ByteBuffer f128b;

    /* renamed from: c */
    private final CharBuffer f129c;

    /* renamed from: d */
    private final IntBuffer f130d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0081f(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.f127a = i;
        this.f128b = byteBuffer;
        this.f129c = charBuffer;
        this.f130d = intBuffer;
    }

    /* renamed from: b */
    public static C0080e m1373b(int i) {
        return new C0080e(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m1374a() {
        int m139a = C0653a.m139a(this.f127a);
        if (m139a != 0) {
            if (m139a != 1) {
                if (m139a == 2) {
                    return this.f130d.arrayOffset();
                }
                throw new UnsupportedOperationException(atm.m897d("24150E553E3D0B19121028"));
            }
            return this.f129c.arrayOffset();
        }
        return this.f128b.arrayOffset();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte[] m1372c() {
        return this.f128b.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final char[] m1371d() {
        return this.f129c.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m1370e() {
        return this.f127a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final int[] m1369f() {
        return this.f130d.array();
    }

    /* renamed from: g */
    public final int m1368g() {
        Buffer buffer;
        int m139a = C0653a.m139a(this.f127a);
        if (m139a == 0) {
            buffer = this.f128b;
        } else if (m139a == 1) {
            buffer = this.f129c;
        } else if (m139a != 2) {
            throw new UnsupportedOperationException(atm.m897d("24150E553E3D0B19121028"));
        } else {
            buffer = this.f130d;
        }
        return buffer.position();
    }

    /* renamed from: h */
    public final int m1367h() {
        Buffer buffer;
        int m139a = C0653a.m139a(this.f127a);
        if (m139a == 0) {
            buffer = this.f128b;
        } else if (m139a == 1) {
            buffer = this.f129c;
        } else if (m139a != 2) {
            throw new UnsupportedOperationException(atm.m897d("24150E553E3D0B19121028"));
        } else {
            buffer = this.f130d;
        }
        return buffer.remaining();
    }
}
