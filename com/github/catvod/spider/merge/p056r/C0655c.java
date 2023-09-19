package com.github.catvod.spider.merge.p056r;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.r.c */
/* loaded from: classes.dex */
final class C0655c extends AbstractC0654b {

    /* renamed from: a */
    private final char f1248a = ',';

    @Override // com.github.catvod.spider.merge.p056r.AbstractC0659g
    /* renamed from: b */
    public final boolean mo136b(char c) {
        return c == this.f1248a;
    }

    public final String toString() {
        char c = this.f1248a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = atm.m897d("5A4B4846786D5C4D424C0D1A293E3F33").charAt(c & 15);
            c = (char) (c >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append(atm.m897d("29121B0701391E1912103E7603095252"));
        sb.append(copyValueOf);
        sb.append(atm.m897d("4D53"));
        return sb.toString();
    }
}
