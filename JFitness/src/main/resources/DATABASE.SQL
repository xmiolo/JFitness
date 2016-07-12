-- Table: public.pessoa

-- DROP TABLE public.pessoa;

CREATE TABLE public.pessoa
(
  "cdPessoa" integer NOT NULL, -- Código de pessoa
  nome character varying(200) NOT NULL, -- Nome completo da pessoa
  senha character varying(200) NOT NULL, -- senha convertida em MD5
  email character varying(200) NOT NULL, -- email pra login
  endereco character varying(200), -- rua tal, numero tal, apartamento tal
  cidade character varying(100), -- Cidade que vive
  CONSTRAINT "pkCdPessoa" PRIMARY KEY ("cdPessoa")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.pessoa
  OWNER TO postgres;
COMMENT ON COLUMN public.pessoa."cdPessoa" IS 'Código de pessoa';
COMMENT ON COLUMN public.pessoa.nome IS 'Nome completo da pessoa';
COMMENT ON COLUMN public.pessoa.senha IS 'senha convertida em MD5
';
COMMENT ON COLUMN public.pessoa.email IS 'email pra login';
COMMENT ON COLUMN public.pessoa.endereco IS 'rua tal, numero tal, apartamento tal';
COMMENT ON COLUMN public.pessoa.cidade IS 'Cidade que vive';

