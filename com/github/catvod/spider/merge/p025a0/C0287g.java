package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0276b;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* renamed from: com.github.catvod.spider.merge.a0.g */
/* loaded from: classes.dex */
public final class C0287g implements Cloneable {

    /* renamed from: d */
    int f526d;

    /* renamed from: a */
    private EnumC0294n f523a = EnumC0294n.f544f;

    /* renamed from: b */
    private Charset f524b = C0276b.f502a;

    /* renamed from: c */
    private final ThreadLocal<CharsetEncoder> f525c = new ThreadLocal<>();

    /* renamed from: e */
    private boolean f527e = true;

    /* renamed from: f */
    private int f528f = 1;

    /* renamed from: g */
    private int f529g = 30;

    /* renamed from: h */
    private int f530h = 1;

    /* renamed from: a */
    public final C0287g clone() {
        try {
            C0287g c0287g = (C0287g) super.clone();
            String name = this.f524b.name();
            c0287g.getClass();
            c0287g.f524b = Charset.forName(name);
            c0287g.f523a = EnumC0294n.valueOf(this.f523a.name());
            return c0287g;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final CharsetEncoder m1017b() {
        CharsetEncoder charsetEncoder = this.f525c.get();
        return charsetEncoder != null ? charsetEncoder : m1013f();
    }

    /* renamed from: c */
    public final EnumC0294n m1016c() {
        return this.f523a;
    }

    /* renamed from: d */
    public final int m1015d() {
        return this.f528f;
    }

    /* renamed from: e */
    public final int m1014e() {
        return this.f529g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final CharsetEncoder m1013f() {
        CharsetEncoder newEncoder = this.f524b.newEncoder();
        this.f525c.set(newEncoder);
        String name = newEncoder.charset().name();
        this.f526d = name.equals(atm.m897d("3F2957341F1B2333")) ? 1 : name.startsWith(atm.m897d("3F2E3C58")) ? 2 : 3;
        return newEncoder;
    }

    /* renamed from: g */
    public final boolean m1012g() {
        return this.f527e;
    }

    /* renamed from: h */
    public final int m1011h() {
        return this.f530h;
    }
}
