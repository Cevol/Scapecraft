package scapecraft.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSergeantGrimSpike extends ModelBase
{
	//fields
	ModelRenderer Footleft;
	ModelRenderer FootRight;
	ModelRenderer LegBottomRight;
	ModelRenderer LegBottomLeft;
	ModelRenderer LegTopRight;
	ModelRenderer LegTopLeft;
	ModelRenderer LowerTorso;
	ModelRenderer UpperTorso;
	ModelRenderer PeckLeft;
	ModelRenderer PeckRight;
	ModelRenderer ShoulderRight;
	ModelRenderer UpperArmRight;
	ModelRenderer LowerArmRight;
	ModelRenderer HandRight;
	ModelRenderer FingerRight1;
	ModelRenderer FingeRight2;
	ModelRenderer FingerRight3;
	ModelRenderer Thumb;
	ModelRenderer ShoulderLeft;
	ModelRenderer UpperArmLeft;
	ModelRenderer LowerArmLeft;
	ModelRenderer HandLeft;
	ModelRenderer FingerLeft1;
	ModelRenderer FingerLeft3;
	ModelRenderer Fingerleft2;
	ModelRenderer FingerLeft3Part1;
	ModelRenderer FingerLeft2Part1;
	ModelRenderer FingerLeft1Part1;
	ModelRenderer ThumbLeft;
	ModelRenderer ThumbLeftPart;
	ModelRenderer Neck;
	ModelRenderer Skull;
	ModelRenderer Chin;
	ModelRenderer ShoulderGuardRightTop;
	ModelRenderer ShoulderGuardRightFront;
	ModelRenderer ShoulderGuardRightBack;
	ModelRenderer EarRight;
	ModelRenderer EarLeft;
	ModelRenderer Nose;
	ModelRenderer MaceHandle;
	ModelRenderer Eye_Patch;
	ModelRenderer Blade1;
	ModelRenderer Blade2;
	ModelRenderer Cut1;
	ModelRenderer Cut2;
	ModelRenderer Cut3;
	ModelRenderer NecLace1;
	ModelRenderer NeckLace2;
	ModelRenderer NeckLace3;
	ModelRenderer NeckLace4;
	ModelRenderer NeckLace5;
	ModelRenderer NeckLace6;
	ModelRenderer NeckLace7;
	ModelRenderer NeckLace8;

	public ModelSergeantGrimSpike()
	{
		textureWidth = 128;
		textureHeight = 64;

		Footleft = new ModelRenderer(this, 97, 51);
		Footleft.addBox(0F, 0F, 0F, 5, 2, 10);
		Footleft.setRotationPoint(-6F, 22F, -3F);
		Footleft.setTextureSize(128, 64);
		Footleft.mirror = true;
		setRotation(Footleft, 0F, 0F, 0F);
		FootRight = new ModelRenderer(this, 97, 51);
		FootRight.addBox(0F, 0F, 0F, 5, 2, 10);
		FootRight.setRotationPoint(1F, 22F, -3F);
		FootRight.setTextureSize(128, 64);
		FootRight.mirror = true;
		setRotation(FootRight, 0F, 0F, 0F);
		LegBottomRight = new ModelRenderer(this, 112, 34);
		LegBottomRight.addBox(0F, 0F, 0F, 4, 12, 4);
		LegBottomRight.setRotationPoint(1.5F, 10.9F, 0.8F);
		LegBottomRight.setTextureSize(128, 64);
		LegBottomRight.mirror = true;
		setRotation(LegBottomRight, 0.1745329F, 0F, 0F);
		LegBottomLeft = new ModelRenderer(this, 112, 34);
		LegBottomLeft.addBox(0F, 0F, 0F, 4, 12, 4);
		LegBottomLeft.setRotationPoint(-5.5F, 10.9F, 0.8F);
		LegBottomLeft.setTextureSize(128, 64);
		LegBottomLeft.mirror = true;
		setRotation(LegBottomLeft, 0.1745329F, 0F, 0F);
		LegTopRight = new ModelRenderer(this, 95, 35);
		LegTopRight.addBox(0F, 0F, 0F, 4, 11, 4);
		LegTopRight.setRotationPoint(1.5F, 0F, 1.6F);
		LegTopRight.setTextureSize(128, 64);
		LegTopRight.mirror = true;
		setRotation(LegTopRight, -0.0872665F, 0F, 0F);
		LegTopLeft = new ModelRenderer(this, 95, 35);
		LegTopLeft.addBox(0F, 0F, 0F, 4, 11, 4);
		LegTopLeft.setRotationPoint(-5.5F, 0F, 1.5F);
		LegTopLeft.setTextureSize(128, 64);
		LegTopLeft.mirror = true;
		setRotation(LegTopLeft, -0.0698132F, 0F, 0F);
		LowerTorso = new ModelRenderer(this, 94, 16);
		LowerTorso.addBox(0F, 0F, 0F, 12, 13, 5);
		LowerTorso.setRotationPoint(-6F, -12F, 1F);
		LowerTorso.setTextureSize(128, 64);
		LowerTorso.mirror = true;
		setRotation(LowerTorso, 0F, 0F, 0F);
		UpperTorso = new ModelRenderer(this, 80, 0);
		UpperTorso.addBox(0F, 0F, 0F, 17, 9, 7);
		UpperTorso.setRotationPoint(-8.5F, -21F, 0F);
		UpperTorso.setTextureSize(128, 64);
		UpperTorso.mirror = true;
		setRotation(UpperTorso, 0F, 0F, 0F);
		PeckLeft = new ModelRenderer(this, 62, 0);
		PeckLeft.addBox(0F, 0F, 0F, 8, 9, 1);
		PeckLeft.setRotationPoint(-8.5F, -21F, 0F);
		PeckLeft.setTextureSize(128, 64);
		PeckLeft.mirror = true;
		setRotation(PeckLeft, 0F, 0.0383972F, 0F);
		PeckRight = new ModelRenderer(this, 62, 11);
		PeckRight.addBox(0F, 0F, 0F, 8, 9, 1);
		PeckRight.setRotationPoint(0.5F, -21F, -0.3F);
		PeckRight.setTextureSize(128, 64);
		PeckRight.mirror = true;
		setRotation(PeckRight, 0F, -0.0383972F, 0F);
		ShoulderRight = new ModelRenderer(this, 0, 41);
		ShoulderRight.addBox(0F, 0F, 0F, 5, 5, 6);
		ShoulderRight.setRotationPoint(8.3F, -20.7F, 0.5F);
		ShoulderRight.setTextureSize(128, 64);
		ShoulderRight.mirror = true;
		setRotation(ShoulderRight, 0F, 0F, 0F);
		UpperArmRight = new ModelRenderer(this, 0, 37);
		UpperArmRight.addBox(0F, 0F, 0F, 4, 10, 5);
		UpperArmRight.setRotationPoint(9F, -16F, 1F);
		UpperArmRight.setTextureSize(128, 64);
		UpperArmRight.mirror = true;
		setRotation(UpperArmRight, 0F, 0F, 0F);
		LowerArmRight = new ModelRenderer(this, 0, 39);
		LowerArmRight.addBox(0F, 0F, 0F, 3, 9, 4);
		LowerArmRight.setRotationPoint(9.5F, -6.5F, 1.5F);
		LowerArmRight.setTextureSize(128, 64);
		LowerArmRight.mirror = true;
		setRotation(LowerArmRight, 0F, 0F, 0F);
		HandRight = new ModelRenderer(this, 0, 52);
		HandRight.addBox(0F, 0F, 0F, 2, 4, 3);
		HandRight.setRotationPoint(10.3F, 2F, 2F);
		HandRight.setTextureSize(128, 64);
		HandRight.mirror = true;
		setRotation(HandRight, 0F, 0F, 0F);
		FingerRight1 = new ModelRenderer(this, 5, 59);
		FingerRight1.addBox(0F, 0F, 0F, 1, 4, 1);
		FingerRight1.setRotationPoint(11.2F, 5.8F, 1.9F);
		FingerRight1.setTextureSize(128, 64);
		FingerRight1.mirror = true;
		setRotation(FingerRight1, 0F, 0F, 0.2094395F);
		FingeRight2 = new ModelRenderer(this, 5, 59);
		FingeRight2.addBox(0F, 0F, 0F, 1, 4, 1);
		FingeRight2.setRotationPoint(11.2F, 5.8F, 3F);
		FingeRight2.setTextureSize(128, 64);
		FingeRight2.mirror = true;
		setRotation(FingeRight2, 0F, 0F, 0.2094395F);
		FingerRight3 = new ModelRenderer(this, 5, 59);
		FingerRight3.addBox(0F, 0F, 0F, 1, 4, 1);
		FingerRight3.setRotationPoint(11.2F, 5.8F, 4.1F);
		FingerRight3.setTextureSize(128, 64);
		FingerRight3.mirror = true;
		setRotation(FingerRight3, 0F, 0F, 0.2094395F);
		Thumb = new ModelRenderer(this, 0, 60);
		Thumb.addBox(0F, 0F, 0F, 1, 3, 1);
		Thumb.setRotationPoint(10.3F, 4F, 2F);
		Thumb.setTextureSize(128, 64);
		Thumb.mirror = true;
		setRotation(Thumb, 0.1919862F, 0F, 0.6981317F);
		ShoulderLeft = new ModelRenderer(this, 0, 41);
		ShoulderLeft.addBox(0F, 0F, 0F, 5, 5, 6);
		ShoulderLeft.setRotationPoint(-13.4F, -20.7F, 0.5F);
		ShoulderLeft.setTextureSize(128, 64);
		ShoulderLeft.mirror = true;
		setRotation(ShoulderLeft, 0F, 0F, 0F);
		UpperArmLeft = new ModelRenderer(this, 0, 37);
		UpperArmLeft.addBox(0F, 0F, 0F, 4, 10, 5);
		UpperArmLeft.setRotationPoint(-13F, -16F, 1F);
		UpperArmLeft.setTextureSize(128, 64);
		UpperArmLeft.mirror = true;
		setRotation(UpperArmLeft, 0.0872665F, 0F, 0F);
		LowerArmLeft = new ModelRenderer(this, 0, 39);
		LowerArmLeft.addBox(0F, 0F, 0F, 3, 9, 4);
		LowerArmLeft.setRotationPoint(-12.5F, -7.1F, 2.5F);
		LowerArmLeft.setTextureSize(128, 64);
		LowerArmLeft.mirror = true;
		setRotation(LowerArmLeft, -0.1745329F, 0F, 0F);
		HandLeft = new ModelRenderer(this, 0, 52);
		HandLeft.addBox(0F, 0F, 0F, 2, 4, 3);
		HandLeft.setRotationPoint(-12.3F, 0.3F, 1.5F);
		HandLeft.setTextureSize(128, 64);
		HandLeft.mirror = true;
		setRotation(HandRight, -0.6981317F, 0F, 0F);
		FingerLeft1 = new ModelRenderer(this, 10, 61);
		FingerLeft1.addBox(0F, 0F, 0F, 1, 2, 1);
		FingerLeft1.setRotationPoint(-12.2F, 3.2F, -1F);
		FingerLeft1.setTextureSize(128, 64);
		FingerLeft1.mirror = true;
		setRotation(FingerLeft1, -0.7330383F, -0.296706F, -0.296706F);
		FingerLeft3 = new ModelRenderer(this, 10, 61);
		FingerLeft3.addBox(0F, 0F, 0F, 1, 2, 1);
		FingerLeft3.setRotationPoint(-12.2F, 4.6F, 0.6F);
		FingerLeft3.setTextureSize(128, 64);
		FingerLeft3.mirror = true;
		setRotation(FingerLeft3, -0.7330383F, -0.296706F, -0.296706F);
		Fingerleft2 = new ModelRenderer(this, 10, 61);
		Fingerleft2.addBox(0F, 0F, 0F, 1, 2, 1);
		Fingerleft2.setRotationPoint(-12.2F, 3.9F, -0.2F);
		Fingerleft2.setTextureSize(128, 64);
		Fingerleft2.mirror = true;
		setRotation(Fingerleft2, -0.7330383F, -0.296706F, -0.296706F);
		FingerLeft3Part1 = new ModelRenderer(this, 14, 61);
		FingerLeft3Part1.addBox(0F, 0F, 0F, 1, 2, 1);
		FingerLeft3Part1.setRotationPoint(-11.4F, 6F, -0.5F);
		FingerLeft3Part1.setTextureSize(128, 64);
		FingerLeft3Part1.mirror = true;
		setRotation(FingerLeft3Part1, -1.012291F, -0.8552113F, -0.7504916F);
		FingerLeft2Part1 = new ModelRenderer(this, 14, 61);
		FingerLeft2Part1.addBox(0F, 0F, 0F, 1, 2, 1);
		FingerLeft2Part1.setRotationPoint(-11.4F, 5.4F, -1.4F);
		FingerLeft2Part1.setTextureSize(128, 64);
		FingerLeft2Part1.mirror = true;
		setRotation(FingerLeft2Part1, -1.012291F, -0.8726646F, -0.7853982F);
		FingerLeft1Part1 = new ModelRenderer(this, 14, 61);
		FingerLeft1Part1.addBox(0F, 0F, 0F, 1, 2, 1);
		FingerLeft1Part1.setRotationPoint(-11.4F, 4.7F, -2.2F);
		FingerLeft1Part1.setTextureSize(128, 64);
		FingerLeft1Part1.mirror = true;
		setRotation(FingerLeft1Part1, -1.012291F, -0.8726646F, -0.7679449F);
		ThumbLeft = new ModelRenderer(this, 14, 61);
		ThumbLeft.addBox(0F, 0F, 0F, 1, 2, 1);
		ThumbLeft.setRotationPoint(-11.9F, 2F, 0F);
		ThumbLeft.setTextureSize(128, 64);
		ThumbLeft.mirror = true;
		setRotation(ThumbLeft, -1.658063F, -0.7504916F, 0F);
		ThumbLeftPart = new ModelRenderer(this, 14, 61);
		ThumbLeftPart.addBox(0F, 0F, 0F, 1, 2, 1);
		ThumbLeftPart.setRotationPoint(-10.6F, 2.8F, -1.4F);
		ThumbLeftPart.setTextureSize(128, 64);
		ThumbLeftPart.mirror = true;
		setRotation(ThumbLeftPart, -0.6632251F, -0.4886922F, -1.27409F);
		Neck = new ModelRenderer(this, 72, 57);
		Neck.addBox(0F, 0F, 0F, 4, 2, 4);
		Neck.setRotationPoint(-2F, -22.8F, 1.5F);
		Neck.setTextureSize(128, 64);
		Neck.mirror = true;
		setRotation(Neck, 0F, 0F, 0F);
		Skull = new ModelRenderer(this, 68, 44);
		Skull.addBox(0F, 0F, 0F, 7, 7, 5);
		Skull.setRotationPoint(-3.5F, -29.66667F, 1F);
		Skull.setTextureSize(128, 64);
		Skull.mirror = true;
		setRotation(Skull, 0F, 0F, 0F);
		Chin = new ModelRenderer(this, 61, 57);
		Chin.addBox(0F, 0F, 0F, 4, 2, 1);
		Chin.setRotationPoint(-2F, -23.5F, 1F);
		Chin.setTextureSize(128, 64);
		Chin.mirror = true;
		setRotation(Chin, -0.6632251F, 0F, 0F);
		ShoulderGuardRightTop = new ModelRenderer(this, 60, 32);
		ShoulderGuardRightTop.addBox(0F, 0F, 0F, 7, 2, 9);
		ShoulderGuardRightTop.setRotationPoint(7F, -23F, -1F);
		ShoulderGuardRightTop.setTextureSize(128, 64);
		ShoulderGuardRightTop.mirror = true;
		setRotation(ShoulderGuardRightTop, 0F, 0F, 0F);
		ShoulderGuardRightFront = new ModelRenderer(this, 60, 32);
		ShoulderGuardRightFront.addBox(0F, 0F, 0F, 7, 7, 1);
		ShoulderGuardRightFront.setRotationPoint(7F, -22F, -1F);
		ShoulderGuardRightFront.setTextureSize(128, 64);
		ShoulderGuardRightFront.mirror = true;
		setRotation(ShoulderGuardRightFront, 0F, 0F, 0F);
		ShoulderGuardRightBack = new ModelRenderer(this, 60, 32);
		ShoulderGuardRightBack.addBox(0F, 0F, 0F, 7, 7, 1);
		ShoulderGuardRightBack.setRotationPoint(7F, -22F, 7F);
		ShoulderGuardRightBack.setTextureSize(128, 64);
		ShoulderGuardRightBack.mirror = true;
		setRotation(ShoulderGuardRightBack, 0F, 0F, 0F);
		EarRight = new ModelRenderer(this, 53, 0);
		EarRight.addBox(0F, 0F, 0F, 3, 1, 1);
		EarRight.setRotationPoint(3F, -27.5F, 2.5F);
		EarRight.setTextureSize(128, 64);
		EarRight.mirror = true;
		setRotation(EarRight, 0F, -0.4537856F, -0.1745329F);
		EarLeft = new ModelRenderer(this, 54, 0);
		EarLeft.addBox(0F, 0F, 0F, 3, 1, 1);
		EarLeft.setRotationPoint(-6F, -28F, 4F);
		EarLeft.setTextureSize(128, 64);
		EarLeft.mirror = true;
		setRotation(EarLeft, 0F, 0.4537856F, 0.1745329F);
		Nose = new ModelRenderer(this, 57, 2);
		Nose.addBox(0F, 0F, 0F, 1, 2, 1);
		Nose.setRotationPoint(-0.5F, -26F, 1F);
		Nose.setTextureSize(128, 64);
		Nose.mirror = true;
		setRotation(Nose, -1.082104F, 0F, 0F);
		MaceHandle = new ModelRenderer(this, 0, 5);
		MaceHandle.addBox(0F, 0F, 0F, 2, 2, 28);
		MaceHandle.setRotationPoint(-11F, -4F, -10F);
		MaceHandle.setTextureSize(128, 64);
		MaceHandle.mirror = true;
		setRotation(MaceHandle, -0.6632251F, 0F, 0F);
		Eye_Patch = new ModelRenderer(this, 11, 57);
		Eye_Patch.addBox(0F, 0F, 0F, 2, 2, 1);
		Eye_Patch.setRotationPoint(-2.5F, -27.6F, 0.7F);
		Eye_Patch.setTextureSize(128, 64);
		Eye_Patch.mirror = true;
		setRotation(Eye_Patch, 0F, 0F, 0F);
		Blade1 = new ModelRenderer(this, 0, 0);
		Blade1.addBox(0F, 0F, 0F, 1, 5, 4);
		Blade1.setRotationPoint(-10.5F, 1F, -13F);
		Blade1.setTextureSize(128, 64);
		Blade1.mirror = true;
		setRotation(Blade1, 0.9075712F, 0F, 0F);
		Blade2 = new ModelRenderer(this, 0, 9);
		Blade2.addBox(0F, 0F, 0F, 2, 2, 7);
		Blade2.setRotationPoint(-11F, 0F, -13.5F);
		Blade2.setTextureSize(128, 64);
		Blade2.mirror = true;
		setRotation(Blade2, -0.6806784F, 0F, 0F);
		Cut1 = new ModelRenderer(this, 48, 58);
		Cut1.addBox(0F, 0F, 0F, 1, 1, 5);
		Cut1.setRotationPoint(-13.5F, -20.8F, 1F);
		Cut1.setTextureSize(128, 64);
		Cut1.mirror = true;
		setRotation(Cut1, 0F, 0F, 0F);
		Cut2 = new ModelRenderer(this, 56, 55);
		Cut2.addBox(0F, 0F, 0F, 1, 2, 1);
		Cut2.setRotationPoint(-13.5F, -20.8F, 0.4F);
		Cut2.setTextureSize(128, 64);
		Cut2.mirror = true;
		setRotation(Cut2, 0F, 0F, -0.0872665F);
		Cut3 = new ModelRenderer(this, 56, 55);
		Cut3.addBox(0F, 0F, 0F, 1, 2, 1);
		Cut3.setRotationPoint(-13.5F, -20.8F, 5.6F);
		Cut3.setTextureSize(128, 64);
		Cut3.mirror = true;
		setRotation(Cut3, 0F, 0F, -0.0872665F);
		NecLace1 = new ModelRenderer(this, 25, 45);
		NecLace1.addBox(0F, 0F, 0F, 1, 1, 7);
		NecLace1.setRotationPoint(3F, -21.1F, -0.1F);
		NecLace1.setTextureSize(128, 64);
		NecLace1.mirror = true;
		setRotation(NecLace1, 0F, 0.0872665F, 0F);
		NeckLace2 = new ModelRenderer(this, 25, 45);
		NeckLace2.addBox(0F, 0F, 0F, 1, 1, 7);
		NeckLace2.setRotationPoint(-4F, -21.1F, -0.3F);
		NeckLace2.setTextureSize(128, 64);
		NeckLace2.mirror = true;
		setRotation(NeckLace2, 0F, -0.0698132F, 0F);
		NeckLace3 = new ModelRenderer(this, 25, 40);
		NeckLace3.addBox(0F, 0F, 0F, 1, 3, 1);
		NeckLace3.setRotationPoint(3.1F, -21F, -0.2F);
		NeckLace3.setTextureSize(128, 64);
		NeckLace3.mirror = true;
		setRotation(NeckLace3, -0.0698132F, 0F, 0.418879F);
		NeckLace4 = new ModelRenderer(this, 25, 40);
		NeckLace4.addBox(0F, 0F, 0F, 1, 3, 1);
		NeckLace4.setRotationPoint(-4F, -20.7F, -0.2F);
		NeckLace4.setTextureSize(128, 64);
		NeckLace4.mirror = true;
		setRotation(NeckLace4, -0.0523599F, 0.0174533F, -0.3665191F);
		NeckLace5 = new ModelRenderer(this, 25, 37);
		NeckLace5.addBox(0F, 0F, 0F, 6, 1, 1);
		NeckLace5.setRotationPoint(-3F, -18.5F, -0.4F);
		NeckLace5.setTextureSize(128, 64);
		NeckLace5.mirror = true;
		setRotation(NeckLace5, 0F, 0.0174533F, 0F);
		NeckLace6 = new ModelRenderer(this, 25, 54);
		NeckLace6.addBox(0F, 0F, 0F, 9, 1, 1);
		NeckLace6.setRotationPoint(-4.4F, -21.1F, 5.8F);
		NeckLace6.setTextureSize(128, 64);
		NeckLace6.mirror = true;
		setRotation(NeckLace6, 0F, 0F, 0F);
		NeckLace7 = new ModelRenderer(this, 30, 40);
		NeckLace7.addBox(0F, 0F, 0F, 1, 1, 3);
		NeckLace7.setRotationPoint(4.5F, -21.1F, 0F);
		NeckLace7.setTextureSize(128, 64);
		NeckLace7.mirror = true;
		setRotation(NeckLace7, 0F, -0.3839724F, 0F);
		NeckLace8 = new ModelRenderer(this, 30, 40);
		NeckLace8.addBox(0F, 0F, 0F, 1, 1, 3);
		NeckLace8.setRotationPoint(-5.4F, -21.1F, 0.5F);
		NeckLace8.setTextureSize(128, 64);
		NeckLace8.mirror = true;
		setRotation(NeckLace8, 0F, 0.3839724F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Footleft.render(f5);
		FootRight.render(f5);
		LegBottomRight.render(f5);
		LegBottomLeft.render(f5);
		LegTopRight.render(f5);
		LegTopLeft.render(f5);
		LowerTorso.render(f5);
		UpperTorso.render(f5);
		PeckLeft.render(f5);
		PeckRight.render(f5);
		ShoulderRight.render(f5);
		UpperArmRight.render(f5);
		LowerArmRight.render(f5);
		HandRight.render(f5);
		FingerRight1.render(f5);
		FingeRight2.render(f5);
		FingerRight3.render(f5);
		Thumb.render(f5);
		ShoulderLeft.render(f5);
		UpperArmLeft.render(f5);
		LowerArmLeft.render(f5);
		HandRight.render(f5);
		FingerLeft1.render(f5);
		FingerLeft3.render(f5);
		Fingerleft2.render(f5);
		FingerLeft3Part1.render(f5);
		FingerLeft2Part1.render(f5);
		FingerLeft1Part1.render(f5);
		ThumbLeft.render(f5);
		ThumbLeftPart.render(f5);
		Neck.render(f5);
		Skull.render(f5);
		Chin.render(f5);
		ShoulderGuardRightTop.render(f5);
		ShoulderGuardRightFront.render(f5);
		ShoulderGuardRightBack.render(f5);
		EarRight.render(f5);
		EarLeft.render(f5);
		Nose.render(f5);
		MaceHandle.render(f5);
		Eye_Patch.render(f5);
		Blade1.render(f5);
		Blade2.render(f5);
		Cut1.render(f5);
		Cut2.render(f5);
		Cut3.render(f5);
		NecLace1.render(f5);
		NeckLace2.render(f5);
		NeckLace3.render(f5);
		NeckLace4.render(f5);
		NeckLace5.render(f5);
		NeckLace6.render(f5);
		NeckLace7.render(f5);
		NeckLace8.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
		FootRight.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
		Footleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
	}

}
