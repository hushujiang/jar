package com.github.catvod.spider.merge.p058t;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p056r.C0671s;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.t.e */
/* loaded from: classes.dex */
public class C0692e extends AbstractC0693f {

    /* renamed from: b */
    final C0688a f1308b;

    /* renamed from: c */
    final Character f1309c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0692e(C0688a c0688a, Character ch) {
        this.f1308b = c0688a;
        if (!(ch == null || !c0688a.m93e(ch.charValue()))) {
            throw new IllegalArgumentException(C0671s.m113b(atm.m897d("3A1B1E1125360D5A191D2D2A0B190E103E784F095A022D2B4A1B160729390E035A1C22780B160A1D2D3A0F0E"), ch));
        }
        this.f1309c = ch;
    }

    @Override // com.github.catvod.spider.merge.p058t.AbstractC0693f
    /* renamed from: c */
    int mo90c(byte[] bArr, CharSequence charSequence) {
        C0688a c0688a;
        CharSequence mo89d = mo89d(charSequence);
        if (!this.f1308b.m94d(mo89d.length())) {
            int length = mo89d.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append(atm.m897d("23140C1420310E5A131B3C2D1E5A1610223F1E125A"));
            sb.append(length);
            throw new C0691d(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < mo89d.length()) {
            long j = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                c0688a = this.f1308b;
                if (i3 >= c0688a.f1303d) {
                    break;
                }
                j <<= c0688a.f1302c;
                if (i + i3 < mo89d.length()) {
                    j |= this.f1308b.m96b(mo89d.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = c0688a.f1304e;
            int i6 = (i5 * 8) - (i4 * c0688a.f1302c);
            int i7 = (i5 - 1) * 8;
            while (i7 >= i6) {
                bArr[i2] = (byte) ((j >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.f1308b.f1303d;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p058t.AbstractC0693f
    /* renamed from: d */
    public final CharSequence mo89d(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f1309c;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0692e) {
            C0692e c0692e = (C0692e) obj;
            return this.f1308b.equals(c0692e.f1308b) && C0052e.m1417b(this.f1309c, c0692e.f1309c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1308b.hashCode() ^ Arrays.hashCode(new Object[]{this.f1309c});
    }

    public final String toString() {
        String m897d;
        StringBuilder sb = new StringBuilder(atm.m897d("281B0910093609151E1C223F44"));
        sb.append(this.f1308b.toString());
        if (8 % this.f1308b.f1302c != 0) {
            if (this.f1309c == null) {
                m897d = atm.m897d("4415171C38080B1E1E1C223F4253");
            } else {
                sb.append(atm.m897d("440D130124080B1E391D2D2A425D"));
                sb.append(this.f1309c);
                m897d = atm.m897d("4D53");
            }
            sb.append(m897d);
        }
        return sb.toString();
    }
}
